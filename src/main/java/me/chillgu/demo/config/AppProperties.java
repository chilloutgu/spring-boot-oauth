package me.chillgu.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix= "app")
public class AppProperties {
	
	private final Auth auth = new Auth();
	private final Oauth2 oauth2 = new Oauth2();
	
	public static class Auth {
		
		private String tokenSecret;
		private String tokenExpirationMsec;
		
		public String getTokenSecret() {
			return tokenSecret;
		}
		
		public void setTokenSecret(String tokenSecret) {
			this.tokenSecret = tokenSecret;
		}
		
		public String getTokenExpirationMsec() {
			return tokenExpirationMsec;
		}
		
		public void setTokenExpirationMsec(String tokenExpirationMsec) {
			this.tokenExpirationMsec = tokenExpirationMsec;
		}
	}
	
	public static final class Oauth2 {
		
		private List<String> authorizedRedirectUris = new ArrayList<String>();
		
		public List<String> getAuthorizedRedirectUris() {
			return authorizedRedirectUris;
		}
		
		public Oauth2 authorizedRedirectUris(List<String> authorizedRedirectUris) {
			this.authorizedRedirectUris = authorizedRedirectUris;
			return this;
		}
	}
	
	public Auth getAuth() {
		return auth;
	}
	
	public Oauth2 getOauth2() {
		return oauth2;
	}
}
