package org.indra.repository;

public class PeliculaDbRepoFactory extends PeliculaRepositoryFactory{

	@Override
	public IPeliculaRepository createRepository() {
		return new PeliculaDbRepository();
	}

}
