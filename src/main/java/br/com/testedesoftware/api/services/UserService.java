package br.com.testedesoftware.api.services;

import br.com.testedesoftware.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
