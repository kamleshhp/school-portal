package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    Logger logger = LogManager.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved=true;
        logger.info(contact.toString());
        return isSaved;
    }
}
