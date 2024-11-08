package edu.proyectoApi.servicios;

import edu.proyectoApi.modelos.Club;
import edu.proyectoApi.repositorios.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public Club addClub(Club club) {
        return clubRepository.save(club);
    }
}
