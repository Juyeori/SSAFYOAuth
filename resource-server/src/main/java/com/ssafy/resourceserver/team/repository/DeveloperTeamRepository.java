package com.ssafy.resourceserver.team.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.resourceserver.team.entity.DeveloperTeamEntity;

@Repository
public interface DeveloperTeamRepository extends JpaRepository<DeveloperTeamEntity, Integer> {
	List<DeveloperTeamEntity> findBySeqAndIsDeleteFalse(Integer teamSeq);

}