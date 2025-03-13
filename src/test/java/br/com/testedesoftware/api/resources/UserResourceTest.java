package br.com.testedesoftware.api.resources;

import br.com.testedesoftware.api.domain.User;
import br.com.testedesoftware.api.domain.dto.UserDTO;
import br.com.testedesoftware.api.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserResourceTest {

    private static final Integer id      = 1;
    private static final String NAME     = "Deodato";
    private static final String EMAIL    = "deodato@123.com";
    private static final String PASSWORD = "123";
    public static final String OBJETO_NAO_ENCONTRADO = "Objeto não encontrado!";

    private User user;
    private UserDTO userDTO;

    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        starUser();
    }

    @Test
    void findById() {
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
    }
}