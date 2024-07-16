package com.dev.dev.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.dev.dev.domain.Member;
import com.dev.dev.services.MemberService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MemberController {
  @Autowired
  private MemberService memberService;

  @GetMapping("/api/members")
  public List<Member> findAll() {
      return memberService.findAll();
  }
  
}
