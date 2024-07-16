package com.dev.dev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dev.domain.Member;
import com.dev.dev.repositories.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
  @Autowired
  private final MemberRepository memberRepository;

  public List<Member> findAll(){
    return memberRepository.findAll();
  }
}
