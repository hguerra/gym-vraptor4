package br.com.validation.imp;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.dao.DefaultUsuarioDao;
import br.com.model.bean.Usuario;
import br.com.validation.LoginAvailable;

public class LoginAvailableValidator implements
		ConstraintValidator<LoginAvailable, Usuario> {
	@Inject
	private DefaultUsuarioDao userDao;

	@Override
	public void initialize(LoginAvailable arg0) {

	}

	@Override
	public boolean isValid(Usuario usuario, ConstraintValidatorContext context) {
		return !userDao.verificaUsuarioLogin(usuario);
	}

}
