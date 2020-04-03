package cs_utec.cs2901.repositories;


import cs_utec.cs2901.data.DailyCases;
import org.springframework.data.repository.CrudRepository;

/**
 * Manejo de persistencia de la entidad DailyCases, soporta las operaciones básicas CRUD:
 * - CREATE: INSERT INTO dailycases VALUES (id_values, cantidad, 'fecha');
 * - READ ONE: SELECT * FROM dailycases WHERE id = 2;
 * - READ ALL: SELECT * FROM dailycases;
 * - UPDATE: UPDATE dailycases SET cantidad = 3 WHERE id = 5;
 * - DELETE: DELETE FROM dailycases WHERE id = 3;
 */

public interface DailyCasesRepository extends CrudRepository<DailyCases, Long> {
}
