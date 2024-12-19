package com.jwt.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfing {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF 보호 비활성화
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**", "/favicon.ico").permitAll() // H2 콘솔과 특정 경로 허용
                        .anyRequest().authenticated() // 그 외의 요청은 인증 필요
                )
                .headers(headers -> headers
                        .xssProtection(xss -> xss.disable()) // XSS 보호 비활성화 (필요 시)
                        .frameOptions(frame -> frame.sameOrigin()) // 동일 출처에서의 프레임 사용 허용
                );

        return http.build();
    }
}
