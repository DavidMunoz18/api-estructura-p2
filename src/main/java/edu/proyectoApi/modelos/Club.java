package edu.proyectoApi.modelos;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clubes", schema = "dlk")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clubes_seq")
    @SequenceGenerator(name = "clubes_seq", sequenceName = "dlk.clubes_id_club_seq", allocationSize = 1)
    private Long idClub;

    private String nombreClub;
    private String emailClub;
    private String passwordClub;
    private byte[] logoClub;

    // Getters y Setters

    
    
    @Override
    public String toString() {
        return "Club{" +
                "idClub=" + idClub +
                ", nombreClub='" + nombreClub + '\'' +
                ", emailClub='" + emailClub + '\'' +
                ", passwordClub='" + passwordClub + '\'' +
                ", logoClub=" + Arrays.toString(logoClub) +
                '}';
    }

	public Long getIdClub() {
		return idClub;
	}

	public void setIdClub(Long idClub) {
		this.idClub = idClub;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public String getEmailClub() {
		return emailClub;
	}

	public void setEmailClub(String emailClub) {
		this.emailClub = emailClub;
	}

	public String getPasswordClub() {
		return passwordClub;
	}

	public void setPasswordClub(String passwordClub) {
		this.passwordClub = passwordClub;
	}

	public byte[] getLogoClub() {
		return logoClub;
	}

	public void setLogoClub(byte[] logoClub) {
		this.logoClub = logoClub;
	}
}
