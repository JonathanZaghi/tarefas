package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Pais {

	private int id;
	private String nome;
	private long população;
	private double area;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	public Pais() {
		
	}
	
	public Pais(int id,String nome,long população,double area) {
		this.id = id;
		this.nome = nome;
		this.população = população;
		this.area = area;
	}
	
	public Connection obtemConexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/paises?user=root&password=trabson");
	}

	public void criar() {
		String sqlInsert = "INSERT INTO paises(nome, população, area) VALUES (?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, getNome());
			stm.setLong(2, getPopulação());
			stm.setDouble(3, getArea());
			stm.execute();
			String sqlQuery  = "SELECT LAST_INSERT_ID()";
			try(PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
				ResultSet rs = stm2.executeQuery();) {
				if(rs.next()){
					setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		String sqlUpdate = "UPDATE paises SET nome=?, população=?, area=? WHERE id=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, getNome());
			stm.setLong(2, getPopulação());
			stm.setDouble(3, getArea());
			stm.setInt(4, getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir() {
		String sqlDelete = "DELETE FROM paises WHERE id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void carregar() {
		String sqlSelect = "SELECT nome, população, area FROM paises WHERE paises.id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					setNome(rs.getString("nome"));
					setPopulação(rs.getLong("população"));
					setArea(rs.getDouble("area"));
				} else {
					setId(-1);
					setNome(null);
					setPopulação(0);
					setArea(0);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
	}
		
		public void MaisPessoas() {
			String sqlSelect = "SELECT min(area) from paises ";
			// usando o try with resources do Java 7, que fecha o que abriu
			try (Connection conn = obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setInt(1, getId());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						setArea(rs.getDouble("area"));
					} else {
						setId(-1);
						setNome(null);
						setPopulação(0);
						setArea(0);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}
		
		public void MenorArea() {
			String sqlSelect = "SELECT min(area) FROM paises ";
			// usando o try with resources do Java 7, que fecha o que abriu
			try (Connection conn = obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setInt(1, getId());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						setNome(rs.getString("nome"));
						setPopulação(rs.getLong("população"));
						setArea(rs.getDouble("area"));
					} else {
						setId(-1);
						setNome(null);
						setPopulação(0);
						setArea(0);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulação() {
		return população;
	}

	public void setPopulação(long população) {
		this.população = população;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", população=" + população
				+ ", area=" + area + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area == 0) {
			if (other.area != 0)
				return false;
		}
		if (população == 0) {
			if (other.população != 0)
				return false;
		}
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}



