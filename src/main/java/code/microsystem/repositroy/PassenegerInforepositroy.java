package code.microsystem.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import code.microsystem.entity.PassangerInfo;

public interface PassenegerInforepositroy extends JpaRepository<PassangerInfo, Long> {

}
