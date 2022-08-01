package code.microsystem.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import code.microsystem.entity.PaymentInfo;

public interface PaymentInfoRepositroy extends JpaRepository<PaymentInfo, String> {

}
