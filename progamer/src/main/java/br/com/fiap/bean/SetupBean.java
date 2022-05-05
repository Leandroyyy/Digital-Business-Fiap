package br.com.fiap.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped
public class SetupBean {

	private Setup setup = new Setup();
	private List<Setup> list;
	
	private UploadedFile image;
	
	public SetupBean() {
		list = this.list();
	}
	
	public String save() throws IOException {
		System.out.println(this.setup);
		System.out.println(image.getFileName());
		
		FileOutputStream out = new FileOutputStream("C:\\images\\" + image.getFileName());
		out.write(image.getContent());
		out.close();
		
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

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

}