package model.persistence.dao.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.entities.Paciente;
import model.persistence.dao.paciente.PacienteFullDTO;

public interface IPacienteDAO {
	int save(Paciente paciente) throws SQLException;

	List<PacienteFullDTO> getAll(String table);

	void update(PacienteFullDTO pacienteFullDTO) throws SQLException;

	PacienteFullDTO convertResultSetToEntityDTO(ResultSet resultSet) throws SQLException;
}
