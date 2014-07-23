package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;

public class NFNotaInfoItemImpostoPISAliquota extends NFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaPIS situacaoTributaria;

    @Element(name = "vBC", required = true)
    private BigDecimal valorBaseCalculo;

    @Element(name = "pPIS", required = true)
    private BigDecimal aliquota;

    @Element(name = "vPIS", required = true)
    private BigDecimal valor;

    public NFNotaInfoItemImpostoPISAliquota() {
        this.situacaoTributaria = null;
        this.valorBaseCalculo = null;
        this.aliquota = null;
        this.valor = null;
    }

    public NFNotaInfoSituacaoTributariaPIS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaPIS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public BigDecimal getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public void setValorBaseCalculo(final BigDecimal valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
    }

    public BigDecimal getAliquota() {
        return this.aliquota;
    }

    public void setAliquota(final BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(final BigDecimal valor) {
        this.valor = valor;
    }
}