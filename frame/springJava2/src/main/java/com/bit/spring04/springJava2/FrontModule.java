package com.bit.spring04.springJava2;

public class FrontModule {

	ModuleInter module;

	public FrontModule(Module01 module){
		this.module=module;
	}
	
	public void setModule(Module01 module) {
		this.module = module;
	}
	
	public void started(){
		module.func1();
	}
}
