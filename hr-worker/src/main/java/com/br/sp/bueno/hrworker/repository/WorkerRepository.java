package com.br.sp.bueno.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.sp.bueno.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
	

}
