package org.indra.repository;

public abstract class PeliculaRepositoryFactory {

	public abstract IPeliculaRepository createRepository() throws Exception;

	public static Class repositoryClass = null;

	public static void configureClass(Class repositoryClass) {
		PeliculaRepositoryFactory.repositoryClass = repositoryClass;
	}

	private static PeliculaRepositoryFactory instance;

	// Implementacion singleton
	public static PeliculaRepositoryFactory getInstance() throws Exception {
		if (PeliculaRepositoryFactory.repositoryClass == null)
			throw new Exception("PeliculaRepositoryFactory not configured");
		if (PeliculaRepositoryFactory.instance == null)
			PeliculaRepositoryFactory.instance = (PeliculaRepositoryFactory) PeliculaRepositoryFactory.repositoryClass
					.newInstance();
		return PeliculaRepositoryFactory.instance;
	}
}
