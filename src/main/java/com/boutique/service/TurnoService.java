package com.boutique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutique.model.Turno;
import com.boutique.repository.ITurnoRepository;

@Service
public class TurnoService {

	@Autowired
	private ITurnoRepository turnoRepository;

	public List<Turno> findAll() { return turnoRepository.findAll(); }

	public Optional<Turno> findById(int idTurno) {
		return turnoRepository.findById(idTurno);
	}

}
