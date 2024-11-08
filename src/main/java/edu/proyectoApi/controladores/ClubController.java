package edu.proyectoApi.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.proyectoApi.modelos.Club;
import edu.proyectoApi.servicios.ClubService;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private static final Logger logger = LoggerFactory.getLogger(ClubController.class);

    @Autowired
    private ClubService clubService;

    @PostMapping
    public ResponseEntity<Club> addClub(@RequestBody Club club) {
        logger.info("Datos del club recibidos: " + club.toString());
        logger.info("Nombre del Club: " + club.getNombreClub());
        logger.info("Email del Club: " + club.getEmailClub());
        logger.info("Password del Club: " + club.getPasswordClub());
        Club newClub = clubService.addClub(club);
        return new ResponseEntity<>(newClub, HttpStatus.CREATED);
    }
}
