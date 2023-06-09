//package org.sid.userInfo;
//
//  //package com.chiffrageTest.userInfo;
//  
//  import java.util.ArrayList; import java.util.Collection; import
//  java.util.List; import java.util.Set;
//  
//  import org.springframework.security.core.GrantedAuthority; import
//  org.springframework.security.core.authority.SimpleGrantedAuthority; import
//  org.springframework.security.core.userdetails.UserDetails;
//  
//  import org.sid.entities.Role; import
//  org.sid.entities.User;
//  
//  public class MyUserDetails implements UserDetails {
//  
//  private User user;
//  
//  public MyUserDetails(User user) { this.user = user; }
//  
//  @Override public Collection<? extends GrantedAuthority> getAuthorities() {
//  Collection<Role> roles = user.getRoles(); List<SimpleGrantedAuthority>
//  authorities = new ArrayList<>();
//  
//  for (Role role : roles) { authorities.add(new
//  SimpleGrantedAuthority(role.getRoleName())); }
//  
//  return authorities; }
//  
//  @Override public String getPassword() { return user.getPassword(); }
//  
//  @Override public String getUsername() { return user.getUsername(); }
//  
//  @Override public boolean isAccountNonExpired() { return true; }
//  
//  @Override public boolean isAccountNonLocked() { return true; }
//  
//  @Override public boolean isCredentialsNonExpired() { return true; }
//  
//  @Override public boolean isEnabled() { return user.getActive(); }
//  
//  public boolean hasRole(String roleName) { return this.user.hasRole(roleName);
//  }
//  
//  }
// 