/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.scryfall.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Legality model.
 */
public class Legality {
    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "standard")
    private LegalStatus standard;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "future")
    private LegalStatus future;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "frontier")
    private LegalStatus frontier;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "modern")
    private LegalStatus modern;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "legacy")
    private LegalStatus legacy;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "pauper")
    private LegalStatus pauper;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "vintage")
    private LegalStatus vintage;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "penny")
    private LegalStatus penny;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "commander")
    private LegalStatus commander;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "1v1")
    private LegalStatus onevOne;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "duel")
    private LegalStatus duel;

    /**
     * Possible values include: 'legal', 'not_legal'.
     */
    @JsonProperty(value = "brawl")
    private LegalStatus brawl;

    /**
     * Get the standard value.
     *
     * @return the standard value
     */
    public LegalStatus standard() {
        return this.standard;
    }

    /**
     * Set the standard value.
     *
     * @param standard the standard value to set
     * @return the Legality object itself.
     */
    public Legality withStandard(LegalStatus standard) {
        this.standard = standard;
        return this;
    }

    /**
     * Get the future value.
     *
     * @return the future value
     */
    public LegalStatus future() {
        return this.future;
    }

    /**
     * Set the future value.
     *
     * @param future the future value to set
     * @return the Legality object itself.
     */
    public Legality withFuture(LegalStatus future) {
        this.future = future;
        return this;
    }

    /**
     * Get the frontier value.
     *
     * @return the frontier value
     */
    public LegalStatus frontier() {
        return this.frontier;
    }

    /**
     * Set the frontier value.
     *
     * @param frontier the frontier value to set
     * @return the Legality object itself.
     */
    public Legality withFrontier(LegalStatus frontier) {
        this.frontier = frontier;
        return this;
    }

    /**
     * Get the modern value.
     *
     * @return the modern value
     */
    public LegalStatus modern() {
        return this.modern;
    }

    /**
     * Set the modern value.
     *
     * @param modern the modern value to set
     * @return the Legality object itself.
     */
    public Legality withModern(LegalStatus modern) {
        this.modern = modern;
        return this;
    }

    /**
     * Get the legacy value.
     *
     * @return the legacy value
     */
    public LegalStatus legacy() {
        return this.legacy;
    }

    /**
     * Set the legacy value.
     *
     * @param legacy the legacy value to set
     * @return the Legality object itself.
     */
    public Legality withLegacy(LegalStatus legacy) {
        this.legacy = legacy;
        return this;
    }

    /**
     * Get the pauper value.
     *
     * @return the pauper value
     */
    public LegalStatus pauper() {
        return this.pauper;
    }

    /**
     * Set the pauper value.
     *
     * @param pauper the pauper value to set
     * @return the Legality object itself.
     */
    public Legality withPauper(LegalStatus pauper) {
        this.pauper = pauper;
        return this;
    }

    /**
     * Get the vintage value.
     *
     * @return the vintage value
     */
    public LegalStatus vintage() {
        return this.vintage;
    }

    /**
     * Set the vintage value.
     *
     * @param vintage the vintage value to set
     * @return the Legality object itself.
     */
    public Legality withVintage(LegalStatus vintage) {
        this.vintage = vintage;
        return this;
    }

    /**
     * Get the penny value.
     *
     * @return the penny value
     */
    public LegalStatus penny() {
        return this.penny;
    }

    /**
     * Set the penny value.
     *
     * @param penny the penny value to set
     * @return the Legality object itself.
     */
    public Legality withPenny(LegalStatus penny) {
        this.penny = penny;
        return this;
    }

    /**
     * Get the commander value.
     *
     * @return the commander value
     */
    public LegalStatus commander() {
        return this.commander;
    }

    /**
     * Set the commander value.
     *
     * @param commander the commander value to set
     * @return the Legality object itself.
     */
    public Legality withCommander(LegalStatus commander) {
        this.commander = commander;
        return this;
    }

    /**
     * Get the onevOne value.
     *
     * @return the onevOne value
     */
    public LegalStatus onevOne() {
        return this.onevOne;
    }

    /**
     * Set the onevOne value.
     *
     * @param onevOne the onevOne value to set
     * @return the Legality object itself.
     */
    public Legality withOnevOne(LegalStatus onevOne) {
        this.onevOne = onevOne;
        return this;
    }

    /**
     * Get the duel value.
     *
     * @return the duel value
     */
    public LegalStatus duel() {
        return this.duel;
    }

    /**
     * Set the duel value.
     *
     * @param duel the duel value to set
     * @return the Legality object itself.
     */
    public Legality withDuel(LegalStatus duel) {
        this.duel = duel;
        return this;
    }

    /**
     * Get the brawl value.
     *
     * @return the brawl value
     */
    public LegalStatus brawl() {
        return this.brawl;
    }

    /**
     * Set the brawl value.
     *
     * @param brawl the brawl value to set
     * @return the Legality object itself.
     */
    public Legality withBrawl(LegalStatus brawl) {
        this.brawl = brawl;
        return this;
    }

}