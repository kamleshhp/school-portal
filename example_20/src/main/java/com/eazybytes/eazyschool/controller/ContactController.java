package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;
    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    /*  @PostMapping("/saveMsg")
      public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject, @RequestParam String message) {

          logger.info(String.format("Name :%s", name));
          logger.info("mobileNum :" + mobileNum);
          logger.info("EmailId :" + email);
          logger.info("subject :" + subject);
          logger.info("Magesage :" + message);
          return new ModelAndView("redirect:/contact");
      }*/
    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }

}
