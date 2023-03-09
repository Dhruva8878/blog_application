package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(CommentException.class)
	public ResponseEntity<ErrorDetails> commentExceptionHandler(CommentException e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(PostException.class)
	public ResponseEntity<ErrorDetails> postExceptionHandler(PostException e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<ErrorDetails> categoryExceptionHandler(CategoryException e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> userExceptionHandler(UserException e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.NOT_FOUND);
	}
    
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgumentNotValidException(MethodArgumentNotValidException e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExceptionHandler(Exception e,WebRequest wr){
		
		ErrorDetails er=new ErrorDetails(wr.getDescription(false), e.getMessage(),  LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
