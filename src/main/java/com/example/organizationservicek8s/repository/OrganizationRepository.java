package com.example.organizationservicek8s.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.organizationservicek8s.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Integer> {
	
}
