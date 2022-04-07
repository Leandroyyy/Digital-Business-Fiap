package br.com.fiap.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped
public class SetupBean {

	private Setup setup = new Setup("asdas","testdddando",new BigDecimal(2000));
	
	private List<Setup> list;
	
	public SetupBean() {
		list = this.list();
	}
	
	public void save() {
		System.out.println(this.setup);
		new SetupDao().create(setup);
	}
	
	public List<Setup> list(){
		return new SetupDao().listAll();
	}
	
	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

	public List<Setup> getList() {
		return list;
	}

	public void setList(List<Setup> list) {
		this.list = list;
	}

}