package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped
public class SetupBean {

	private Setup setup = new Setup();
	private List<Setup> list;
	
	public SetupBean() {
		list = this.list();
	}
	
	public String save() {
		System.out.println(this.setup);
		new SetupDao().create(setup);

		showMessage();
		
		return "setups?faces-redirect=true";
	}

	private void showMessage() {
		FacesContext
			.getCurrentInstance()
			.getExternalContext()
			.getFlash()
			.setKeepMessages(true);
		
		// mostrar a messagem sucesso
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("Setup Registered with success"));
	}
	
	public List<Setup> list(){
		return new SetupDao().listAll();
	}
	
	public List<Setup> getList() {
		return list;
	}

	public void setList(List<Setup> list) {
		this.list = list;
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}