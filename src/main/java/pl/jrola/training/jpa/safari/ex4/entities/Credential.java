package pl.jrola.training.jpa.safari.ex4.entities;

import javax.persistence.*;

@Entity(name="ex4.credential")
@Table(name="CREDENTIAL")
public class Credential {

	@Id
	@Column(name="CREDENTIAL_ID")
	public Long credentialId;

	@Column(name="USERNAME")
	private String username;

	@Column(name="PASSWORD")
	private String password;

    @OneToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public Long getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String toString() {
        return "Credential{" +
                "credentialId=" + credentialId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_id=" + user.getUserId() +
                '}';
    }
}
