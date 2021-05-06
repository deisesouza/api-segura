package br.com.dgstascom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Deise Souza
 * Gera login e senha do usuario do sistema, que está usando o Angular para consumir a APIRestfull
 */
@EnableWebSecurity
@EnableAuthorizationServer
@EnableResourceServer
public class Security extends WebSecurityConfigurerAdapter {
	
	//torna o authenticationManager disponivel para a aplicacao
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	//usuario da aplicacao (Angular ou mobile)
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("deise").password("123").roles("ADMIN");
	}
	
	//possibilita usar as configuracoes que estao nessa classe
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
