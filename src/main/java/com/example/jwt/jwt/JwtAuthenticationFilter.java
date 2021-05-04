package com.example.jwt.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    // /login 요청을 하면 로그인 시도를 위해서 실행되는 함수
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        //1. username, password 받아서

        //2. 정상인지 로그인 시도를 해본다. authenticationManager로 로그인 시도를 하면
        // PrincipalDetailsService가 호출 loadUserByUsername() 함수 실행

        //3. PrincipalDetails를 세션에 담고(권한 관리를 위해)

        //4. JWT 토큰을 만들어서 응답해주면됨


        return super.attemptAuthentication(request, response);
    }
}
