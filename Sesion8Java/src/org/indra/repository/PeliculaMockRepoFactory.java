package org.indra.repository;

public class PeliculaMockRepoFactory extends PeliculaRepositoryFactory{

	@Override
	public IPeliculaRepository createRepository() {
		return new PeliculaMockRepository();
	}

}
