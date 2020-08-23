package com.williampeltomaki.core.rest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class WebsiteController {
	
	@GetMapping("/site")
	public String serveSite(){
		Resource webPage = new ClassPathResource("website/index.html");
		
	    try (Reader reader = new InputStreamReader(webPage.getInputStream(), "UTF-8")) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
	}
	
	@GetMapping("/admin")
	public String serveAdminPage(){
		Resource webPage = new ClassPathResource("website/admin.html");
		
	    try (Reader reader = new InputStreamReader(webPage.getInputStream(), "UTF-8")) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
	}
	
}
