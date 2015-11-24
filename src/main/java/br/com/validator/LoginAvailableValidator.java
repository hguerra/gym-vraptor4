package br.com.validator;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.dao.UsuarioDao;
import br.com.model.bean.Usuario;

public class LoginAvailableValidator implements
		ConstraintValidator<LoginAvailable, Usuario> {
	@Inject
	private UsuarioDao userDao;

	@Override
	public void initialize(LoginAvailable arg0) {

	}

	@Override
	public boolean isValid(Usuario usuario, ConstraintValidatorContext context) {
		return !userDao.verificaUsuarioLogin(usuario);
	}

}
