package com.example.ex00.dependency;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Component
@RequiredArgsConstructor
public class Restaurant {

	private final Chef Chef;
}
