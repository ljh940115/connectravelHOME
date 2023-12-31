package com.connectravel.security.service;

import com.connectravel.domain.entity.Member;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Getter @Setter
public class MemberContext extends User {

  private Member member;

  public MemberContext(Member member, List<GrantedAuthority> roles) {
    super(member.getUsername(), member.getPassword(), roles);
    this.member = member;
  }

}