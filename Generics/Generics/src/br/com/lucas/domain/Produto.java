package br.com.lucas.domain;

import java.util.Objects;

public class Produto implements Persistente {

	@Override
	public Long getCodigo ( ) {
		return codigo;
	}

	private Long codigo;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private String descricao;
	private String fabricante;
	private String categoria;

	public Produto ( String codigo , String nome , String quantidade , String preco , String fabricante ,
	                 String descricao , String categoria ) {
		this.codigo = Long.valueOf ( codigo.trim ( ) );
		this.nome = nome;
		this.preco = Double.valueOf ( preco.trim ( ) );
		this.quantidade = Integer.valueOf ( quantidade.trim ( ) );
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.categoria = categoria;
	}

	public void setCodigo ( Long codigo ) {
		this.codigo = codigo;
	}

	public String getNome ( ) {
		return nome;
	}

	public void setNome ( String nome ) {
		this.nome = nome;
	}

	public Double getPreco ( ) {
		return preco;
	}

	public void setPreco ( Double preco ) {
		this.preco = preco;
	}

	public Integer getQuantidade ( ) {
		return quantidade;
	}

	public void setQuantidade ( Integer quantidade ) {
		this.quantidade = quantidade;
	}

	public String getDescricao ( ) {
		return descricao;
	}

	public void setDescricao ( String descricao ) {
		this.descricao = descricao;
	}

	public String getFabricante ( ) {
		return fabricante;
	}

	public void setFabricante ( String fabricante ) {
		this.fabricante = fabricante;
	}

	public String getCategoria ( ) {
		return categoria;
	}

	public void setCategoria ( String categoria ) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals ( Object obj ) {
		if ( this == obj ) {
			return true;
		}
		if ( obj == null || getClass ( ) != obj.getClass ( ) ) {
			return false;
		}

		final Produto other = ( Produto ) obj;
		return Objects.equals ( this.codigo ,
		                        other.codigo );
	}

	@Override
	public int hashCode ( ) {
		return Objects.hashCode ( codigo );
	}

	@Override
	public String toString ( ) {
		return "\n||||||||||||||| PRODUTO |||||||||||||||" +
				"\nCodigo        " + codigo +
				"\nNome          " + nome + '\'' +
				"\nPreco          " + preco +
				"\nQuantidade " + quantidade +
				"\nDescricao    " + descricao + '\'' +
				"\nFabricante   " + fabricante + '\'' +
				"\nCategoria    " + categoria + '\'' +
				"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
	}
}
