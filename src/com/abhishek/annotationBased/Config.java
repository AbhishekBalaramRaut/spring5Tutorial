package com.abhishek.annotationBased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {
		"com.abhishek.annotationBased.models"
		})
public class Config {

}
