package br.com.testedesoftware.api.services.impl;

import br.com.testedesoftware.api.domain.User;
import br.com.testedesoftware.api.domain.dto.UserDTO;
import br.com.testedesoftware.api.respositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class UserServiceImplTest {

    private static final Integer id      = 1;
    private static final String NAME     = "Deodato";
    private static final String EMAIL    = "deodato@123.com";
    private static final String PASSWORD = "123";

    @InjectMocks
    private UserServiceImpl service;

    @Mock
    private UserRepository repository;

    @Mock
    private ModelMapper mapper;

    private User user;
    private UserDTO userDTO;
    private Optional<User> optionalUser;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        starUser();
    }

    @Test
    void whenFindByIdThenReturnAnUserInstance() {
        when(repository.findById(anyInt())).thenReturn(optionalUser);

        User response = service.findById(id);

        assertNotNull(response);
        assertEquals(User.class, response.getClass());
        assertEquals(id, response.getId());
        assertEquals(NAME, response.getName());
        assertEquals(EMAIL, response.getEmail());
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private  void starUser(){
        user = new User(id, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(id, NAME, EMAIL, PASSWORD);
        optionalUser = Optional.of(new User(id, NAME, EMAIL, PASSWORD));
    }
}