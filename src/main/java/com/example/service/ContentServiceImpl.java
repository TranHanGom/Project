package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Content;
import com.example.repository.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService {
	@Autowired
	private ContentRepository contentRepository;

	@Override
	public Iterable<Content> findAll() {
		
		// TODO Auto-generated method stub
		return contentRepository.findAll();
	}

}
