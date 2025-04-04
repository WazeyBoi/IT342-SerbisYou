package edu.cit.serbisyo.repository;

import edu.cit.serbisyo.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    
    MessageEntity findByMessageText(String messageText);
}