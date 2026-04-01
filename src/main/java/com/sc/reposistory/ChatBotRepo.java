package com.sc.reposistory;

import com.sc.model.WhatsAppMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatBotRepo extends JpaRepository<WhatsAppMessage,Long> {
}
