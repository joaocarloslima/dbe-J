package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.DAO;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {
	
	private User user = new User();

	public void save() {
		new DAO<User>(User.class).save(this.user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário cadastrado com sucesso"));
	}
	
	public List<User> getUsers(){
		return new DAO<User>(User.class).getAll();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
