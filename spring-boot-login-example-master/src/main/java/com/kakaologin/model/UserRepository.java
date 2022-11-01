package com.kakaologin.model;

import org.springframework.data.jpa.repository.JpaRepository;

//기본적인 CRUD 함수를 가지고 있음
//JpaRepository를 상속했기 때문에 @Repository 어노테이션 불필요
public interface UserRepository extends JpaRepository<User, Long> {

 // JPA findBy 규칙
 // select * from user_master where kakao_email = ?
 public User findByKakaoEmail(String kakaoEmail);
 
 public User findByUserCode(String userCode);
}
