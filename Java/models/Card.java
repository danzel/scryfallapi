/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.scryfall.api.models;

import java.util.UUID;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Card model.
 */
public class Card {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * The oracleId property.
     */
    @JsonProperty(value = "oracle_id")
    private UUID oracleId;

    /**
     * The multiverseIds property.
     */
    @JsonProperty(value = "multiverse_ids")
    private List<Integer> multiverseIds;

    /**
     * The mtgoId property.
     */
    @JsonProperty(value = "mtgo_id")
    private Integer mtgoId;

    /**
     * The mtgoFoilId property.
     */
    @JsonProperty(value = "mtgo_foil_id")
    private Integer mtgoFoilId;

    /**
     * The uri property.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * The scryfallUri property.
     */
    @JsonProperty(value = "scryfall_uri")
    private String scryfallUri;

    /**
     * The printsSearchUri property.
     */
    @JsonProperty(value = "prints_search_uri")
    private String printsSearchUri;

    /**
     * The rulingsUri property.
     */
    @JsonProperty(value = "rulings_uri")
    private String rulingsUri;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Possible values include: 'normal', 'split', 'transform', 'meld',
     * 'leveler', 'saga', 'planar', 'scheme', 'vanguard', 'token',
     * 'double_faced_token', 'emblem', 'augment', 'host'.
     */
    @JsonProperty(value = "layout")
    private Layouts layout;

    /**
     * The cmc property.
     */
    @JsonProperty(value = "cmc")
    private Double cmc;

    /**
     * The typeLine property.
     */
    @JsonProperty(value = "type_line")
    private String typeLine;

    /**
     * The oracleText property.
     */
    @JsonProperty(value = "oracle_text")
    private String oracleText;

    /**
     * The manaCost property.
     */
    @JsonProperty(value = "mana_cost")
    private String manaCost;

    /**
     * The power property.
     */
    @JsonProperty(value = "power")
    private String power;

    /**
     * The toughness property.
     */
    @JsonProperty(value = "toughness")
    private String toughness;

    /**
     * The loyalty property.
     */
    @JsonProperty(value = "loyalty")
    private String loyalty;

    /**
     * The lifeModifier property.
     */
    @JsonProperty(value = "life_modifier")
    private String lifeModifier;

    /**
     * The handModifier property.
     */
    @JsonProperty(value = "hand_modifier")
    private String handModifier;

    /**
     * The colors property.
     */
    @JsonProperty(value = "colors")
    private List<Colors> colors;

    /**
     * The colorIndicator property.
     */
    @JsonProperty(value = "color_indicator")
    private List<Colors> colorIndicator;

    /**
     * The colorIdentity property.
     */
    @JsonProperty(value = "color_identity")
    private List<Colors> colorIdentity;

    /**
     * The allParts property.
     */
    @JsonProperty(value = "all_parts")
    private RelatedCards allParts;

    /**
     * The cardFaces property.
     */
    @JsonProperty(value = "card_faces")
    private List<CardFace> cardFaces;

    /**
     * The legalities property.
     */
    @JsonProperty(value = "legalities")
    private Legality legalities;

    /**
     * The reserved property.
     */
    @JsonProperty(value = "reserved")
    private Boolean reserved;

    /**
     * The edhrecRank property.
     */
    @JsonProperty(value = "edhrec_rank")
    private Integer edhrecRank;

    /**
     * The set property.
     */
    @JsonProperty(value = "set")
    private String set;

    /**
     * The setName property.
     */
    @JsonProperty(value = "set_name")
    private String setName;

    /**
     * The collectorNumber property.
     */
    @JsonProperty(value = "collector_number")
    private String collectorNumber;

    /**
     * The setSearchUri property.
     */
    @JsonProperty(value = "set_search_uri")
    private String setSearchUri;

    /**
     * The scryfallSetUri property.
     */
    @JsonProperty(value = "scryfall_set_uri")
    private String scryfallSetUri;

    /**
     * The imageUris property.
     */
    @JsonProperty(value = "image_uris")
    private ImageUri imageUris;

    /**
     * The highresImage property.
     */
    @JsonProperty(value = "highres_image")
    private Boolean highresImage;

    /**
     * The reprint property.
     */
    @JsonProperty(value = "reprint")
    private Boolean reprint;

    /**
     * The digital property.
     */
    @JsonProperty(value = "digital")
    private Boolean digital;

    /**
     * Possible values include: 'common', 'uncommon', 'rare', 'mythic'.
     */
    @JsonProperty(value = "rarity")
    private Rarity rarity;

    /**
     * The flavorText property.
     */
    @JsonProperty(value = "flavor_text")
    private String flavorText;

    /**
     * The artist property.
     */
    @JsonProperty(value = "artist")
    private String artist;

    /**
     * The illustrationId property.
     */
    @JsonProperty(value = "illustration_id")
    private UUID illustrationId;

    /**
     * The frame property.
     */
    @JsonProperty(value = "frame")
    private String frame;

    /**
     * The fullArt property.
     */
    @JsonProperty(value = "full_art")
    private Boolean fullArt;

    /**
     * The watermark property.
     */
    @JsonProperty(value = "watermark")
    private String watermark;

    /**
     * Possible values include: 'black', 'borderless', 'gold', 'silver',
     * 'white'.
     */
    @JsonProperty(value = "border_color")
    private BorderColors borderColor;

    /**
     * The storySpotlightNumber property.
     */
    @JsonProperty(value = "story_spotlight_number")
    private Integer storySpotlightNumber;

    /**
     * The storySpotlightUri property.
     */
    @JsonProperty(value = "story_spotlight_uri")
    private String storySpotlightUri;

    /**
     * The timeshifted property.
     */
    @JsonProperty(value = "timeshifted")
    private Boolean timeshifted;

    /**
     * The colorshifted property.
     */
    @JsonProperty(value = "colorshifted")
    private Boolean colorshifted;

    /**
     * The futureshifted property.
     */
    @JsonProperty(value = "futureshifted")
    private Boolean futureshifted;

    /**
     * The purchaseUris property.
     */
    @JsonProperty(value = "purchase_uris")
    private Map<String, String> purchaseUris;

    /**
     * The relatedUris property.
     */
    @JsonProperty(value = "related_uris")
    private Map<String, String> relatedUris;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the Card object itself.
     */
    public Card withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the oracleId value.
     *
     * @return the oracleId value
     */
    public UUID oracleId() {
        return this.oracleId;
    }

    /**
     * Set the oracleId value.
     *
     * @param oracleId the oracleId value to set
     * @return the Card object itself.
     */
    public Card withOracleId(UUID oracleId) {
        this.oracleId = oracleId;
        return this;
    }

    /**
     * Get the multiverseIds value.
     *
     * @return the multiverseIds value
     */
    public List<Integer> multiverseIds() {
        return this.multiverseIds;
    }

    /**
     * Set the multiverseIds value.
     *
     * @param multiverseIds the multiverseIds value to set
     * @return the Card object itself.
     */
    public Card withMultiverseIds(List<Integer> multiverseIds) {
        this.multiverseIds = multiverseIds;
        return this;
    }

    /**
     * Get the mtgoId value.
     *
     * @return the mtgoId value
     */
    public Integer mtgoId() {
        return this.mtgoId;
    }

    /**
     * Set the mtgoId value.
     *
     * @param mtgoId the mtgoId value to set
     * @return the Card object itself.
     */
    public Card withMtgoId(Integer mtgoId) {
        this.mtgoId = mtgoId;
        return this;
    }

    /**
     * Get the mtgoFoilId value.
     *
     * @return the mtgoFoilId value
     */
    public Integer mtgoFoilId() {
        return this.mtgoFoilId;
    }

    /**
     * Set the mtgoFoilId value.
     *
     * @param mtgoFoilId the mtgoFoilId value to set
     * @return the Card object itself.
     */
    public Card withMtgoFoilId(Integer mtgoFoilId) {
        this.mtgoFoilId = mtgoFoilId;
        return this;
    }

    /**
     * Get the uri value.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     * @return the Card object itself.
     */
    public Card withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the scryfallUri value.
     *
     * @return the scryfallUri value
     */
    public String scryfallUri() {
        return this.scryfallUri;
    }

    /**
     * Set the scryfallUri value.
     *
     * @param scryfallUri the scryfallUri value to set
     * @return the Card object itself.
     */
    public Card withScryfallUri(String scryfallUri) {
        this.scryfallUri = scryfallUri;
        return this;
    }

    /**
     * Get the printsSearchUri value.
     *
     * @return the printsSearchUri value
     */
    public String printsSearchUri() {
        return this.printsSearchUri;
    }

    /**
     * Set the printsSearchUri value.
     *
     * @param printsSearchUri the printsSearchUri value to set
     * @return the Card object itself.
     */
    public Card withPrintsSearchUri(String printsSearchUri) {
        this.printsSearchUri = printsSearchUri;
        return this;
    }

    /**
     * Get the rulingsUri value.
     *
     * @return the rulingsUri value
     */
    public String rulingsUri() {
        return this.rulingsUri;
    }

    /**
     * Set the rulingsUri value.
     *
     * @param rulingsUri the rulingsUri value to set
     * @return the Card object itself.
     */
    public Card withRulingsUri(String rulingsUri) {
        this.rulingsUri = rulingsUri;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Card object itself.
     */
    public Card withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the layout value.
     *
     * @return the layout value
     */
    public Layouts layout() {
        return this.layout;
    }

    /**
     * Set the layout value.
     *
     * @param layout the layout value to set
     * @return the Card object itself.
     */
    public Card withLayout(Layouts layout) {
        this.layout = layout;
        return this;
    }

    /**
     * Get the cmc value.
     *
     * @return the cmc value
     */
    public Double cmc() {
        return this.cmc;
    }

    /**
     * Set the cmc value.
     *
     * @param cmc the cmc value to set
     * @return the Card object itself.
     */
    public Card withCmc(Double cmc) {
        this.cmc = cmc;
        return this;
    }

    /**
     * Get the typeLine value.
     *
     * @return the typeLine value
     */
    public String typeLine() {
        return this.typeLine;
    }

    /**
     * Set the typeLine value.
     *
     * @param typeLine the typeLine value to set
     * @return the Card object itself.
     */
    public Card withTypeLine(String typeLine) {
        this.typeLine = typeLine;
        return this;
    }

    /**
     * Get the oracleText value.
     *
     * @return the oracleText value
     */
    public String oracleText() {
        return this.oracleText;
    }

    /**
     * Set the oracleText value.
     *
     * @param oracleText the oracleText value to set
     * @return the Card object itself.
     */
    public Card withOracleText(String oracleText) {
        this.oracleText = oracleText;
        return this;
    }

    /**
     * Get the manaCost value.
     *
     * @return the manaCost value
     */
    public String manaCost() {
        return this.manaCost;
    }

    /**
     * Set the manaCost value.
     *
     * @param manaCost the manaCost value to set
     * @return the Card object itself.
     */
    public Card withManaCost(String manaCost) {
        this.manaCost = manaCost;
        return this;
    }

    /**
     * Get the power value.
     *
     * @return the power value
     */
    public String power() {
        return this.power;
    }

    /**
     * Set the power value.
     *
     * @param power the power value to set
     * @return the Card object itself.
     */
    public Card withPower(String power) {
        this.power = power;
        return this;
    }

    /**
     * Get the toughness value.
     *
     * @return the toughness value
     */
    public String toughness() {
        return this.toughness;
    }

    /**
     * Set the toughness value.
     *
     * @param toughness the toughness value to set
     * @return the Card object itself.
     */
    public Card withToughness(String toughness) {
        this.toughness = toughness;
        return this;
    }

    /**
     * Get the loyalty value.
     *
     * @return the loyalty value
     */
    public String loyalty() {
        return this.loyalty;
    }

    /**
     * Set the loyalty value.
     *
     * @param loyalty the loyalty value to set
     * @return the Card object itself.
     */
    public Card withLoyalty(String loyalty) {
        this.loyalty = loyalty;
        return this;
    }

    /**
     * Get the lifeModifier value.
     *
     * @return the lifeModifier value
     */
    public String lifeModifier() {
        return this.lifeModifier;
    }

    /**
     * Set the lifeModifier value.
     *
     * @param lifeModifier the lifeModifier value to set
     * @return the Card object itself.
     */
    public Card withLifeModifier(String lifeModifier) {
        this.lifeModifier = lifeModifier;
        return this;
    }

    /**
     * Get the handModifier value.
     *
     * @return the handModifier value
     */
    public String handModifier() {
        return this.handModifier;
    }

    /**
     * Set the handModifier value.
     *
     * @param handModifier the handModifier value to set
     * @return the Card object itself.
     */
    public Card withHandModifier(String handModifier) {
        this.handModifier = handModifier;
        return this;
    }

    /**
     * Get the colors value.
     *
     * @return the colors value
     */
    public List<Colors> colors() {
        return this.colors;
    }

    /**
     * Set the colors value.
     *
     * @param colors the colors value to set
     * @return the Card object itself.
     */
    public Card withColors(List<Colors> colors) {
        this.colors = colors;
        return this;
    }

    /**
     * Get the colorIndicator value.
     *
     * @return the colorIndicator value
     */
    public List<Colors> colorIndicator() {
        return this.colorIndicator;
    }

    /**
     * Set the colorIndicator value.
     *
     * @param colorIndicator the colorIndicator value to set
     * @return the Card object itself.
     */
    public Card withColorIndicator(List<Colors> colorIndicator) {
        this.colorIndicator = colorIndicator;
        return this;
    }

    /**
     * Get the colorIdentity value.
     *
     * @return the colorIdentity value
     */
    public List<Colors> colorIdentity() {
        return this.colorIdentity;
    }

    /**
     * Set the colorIdentity value.
     *
     * @param colorIdentity the colorIdentity value to set
     * @return the Card object itself.
     */
    public Card withColorIdentity(List<Colors> colorIdentity) {
        this.colorIdentity = colorIdentity;
        return this;
    }

    /**
     * Get the allParts value.
     *
     * @return the allParts value
     */
    public RelatedCards allParts() {
        return this.allParts;
    }

    /**
     * Set the allParts value.
     *
     * @param allParts the allParts value to set
     * @return the Card object itself.
     */
    public Card withAllParts(RelatedCards allParts) {
        this.allParts = allParts;
        return this;
    }

    /**
     * Get the cardFaces value.
     *
     * @return the cardFaces value
     */
    public List<CardFace> cardFaces() {
        return this.cardFaces;
    }

    /**
     * Set the cardFaces value.
     *
     * @param cardFaces the cardFaces value to set
     * @return the Card object itself.
     */
    public Card withCardFaces(List<CardFace> cardFaces) {
        this.cardFaces = cardFaces;
        return this;
    }

    /**
     * Get the legalities value.
     *
     * @return the legalities value
     */
    public Legality legalities() {
        return this.legalities;
    }

    /**
     * Set the legalities value.
     *
     * @param legalities the legalities value to set
     * @return the Card object itself.
     */
    public Card withLegalities(Legality legalities) {
        this.legalities = legalities;
        return this;
    }

    /**
     * Get the reserved value.
     *
     * @return the reserved value
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved value.
     *
     * @param reserved the reserved value to set
     * @return the Card object itself.
     */
    public Card withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the edhrecRank value.
     *
     * @return the edhrecRank value
     */
    public Integer edhrecRank() {
        return this.edhrecRank;
    }

    /**
     * Set the edhrecRank value.
     *
     * @param edhrecRank the edhrecRank value to set
     * @return the Card object itself.
     */
    public Card withEdhrecRank(Integer edhrecRank) {
        this.edhrecRank = edhrecRank;
        return this;
    }

    /**
     * Get the set value.
     *
     * @return the set value
     */
    public String set() {
        return this.set;
    }

    /**
     * Set the set value.
     *
     * @param set the set value to set
     * @return the Card object itself.
     */
    public Card withSet(String set) {
        this.set = set;
        return this;
    }

    /**
     * Get the setName value.
     *
     * @return the setName value
     */
    public String setName() {
        return this.setName;
    }

    /**
     * Set the setName value.
     *
     * @param setName the setName value to set
     * @return the Card object itself.
     */
    public Card withSetName(String setName) {
        this.setName = setName;
        return this;
    }

    /**
     * Get the collectorNumber value.
     *
     * @return the collectorNumber value
     */
    public String collectorNumber() {
        return this.collectorNumber;
    }

    /**
     * Set the collectorNumber value.
     *
     * @param collectorNumber the collectorNumber value to set
     * @return the Card object itself.
     */
    public Card withCollectorNumber(String collectorNumber) {
        this.collectorNumber = collectorNumber;
        return this;
    }

    /**
     * Get the setSearchUri value.
     *
     * @return the setSearchUri value
     */
    public String setSearchUri() {
        return this.setSearchUri;
    }

    /**
     * Set the setSearchUri value.
     *
     * @param setSearchUri the setSearchUri value to set
     * @return the Card object itself.
     */
    public Card withSetSearchUri(String setSearchUri) {
        this.setSearchUri = setSearchUri;
        return this;
    }

    /**
     * Get the scryfallSetUri value.
     *
     * @return the scryfallSetUri value
     */
    public String scryfallSetUri() {
        return this.scryfallSetUri;
    }

    /**
     * Set the scryfallSetUri value.
     *
     * @param scryfallSetUri the scryfallSetUri value to set
     * @return the Card object itself.
     */
    public Card withScryfallSetUri(String scryfallSetUri) {
        this.scryfallSetUri = scryfallSetUri;
        return this;
    }

    /**
     * Get the imageUris value.
     *
     * @return the imageUris value
     */
    public ImageUri imageUris() {
        return this.imageUris;
    }

    /**
     * Set the imageUris value.
     *
     * @param imageUris the imageUris value to set
     * @return the Card object itself.
     */
    public Card withImageUris(ImageUri imageUris) {
        this.imageUris = imageUris;
        return this;
    }

    /**
     * Get the highresImage value.
     *
     * @return the highresImage value
     */
    public Boolean highresImage() {
        return this.highresImage;
    }

    /**
     * Set the highresImage value.
     *
     * @param highresImage the highresImage value to set
     * @return the Card object itself.
     */
    public Card withHighresImage(Boolean highresImage) {
        this.highresImage = highresImage;
        return this;
    }

    /**
     * Get the reprint value.
     *
     * @return the reprint value
     */
    public Boolean reprint() {
        return this.reprint;
    }

    /**
     * Set the reprint value.
     *
     * @param reprint the reprint value to set
     * @return the Card object itself.
     */
    public Card withReprint(Boolean reprint) {
        this.reprint = reprint;
        return this;
    }

    /**
     * Get the digital value.
     *
     * @return the digital value
     */
    public Boolean digital() {
        return this.digital;
    }

    /**
     * Set the digital value.
     *
     * @param digital the digital value to set
     * @return the Card object itself.
     */
    public Card withDigital(Boolean digital) {
        this.digital = digital;
        return this;
    }

    /**
     * Get the rarity value.
     *
     * @return the rarity value
     */
    public Rarity rarity() {
        return this.rarity;
    }

    /**
     * Set the rarity value.
     *
     * @param rarity the rarity value to set
     * @return the Card object itself.
     */
    public Card withRarity(Rarity rarity) {
        this.rarity = rarity;
        return this;
    }

    /**
     * Get the flavorText value.
     *
     * @return the flavorText value
     */
    public String flavorText() {
        return this.flavorText;
    }

    /**
     * Set the flavorText value.
     *
     * @param flavorText the flavorText value to set
     * @return the Card object itself.
     */
    public Card withFlavorText(String flavorText) {
        this.flavorText = flavorText;
        return this;
    }

    /**
     * Get the artist value.
     *
     * @return the artist value
     */
    public String artist() {
        return this.artist;
    }

    /**
     * Set the artist value.
     *
     * @param artist the artist value to set
     * @return the Card object itself.
     */
    public Card withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * Get the illustrationId value.
     *
     * @return the illustrationId value
     */
    public UUID illustrationId() {
        return this.illustrationId;
    }

    /**
     * Set the illustrationId value.
     *
     * @param illustrationId the illustrationId value to set
     * @return the Card object itself.
     */
    public Card withIllustrationId(UUID illustrationId) {
        this.illustrationId = illustrationId;
        return this;
    }

    /**
     * Get the frame value.
     *
     * @return the frame value
     */
    public String frame() {
        return this.frame;
    }

    /**
     * Set the frame value.
     *
     * @param frame the frame value to set
     * @return the Card object itself.
     */
    public Card withFrame(String frame) {
        this.frame = frame;
        return this;
    }

    /**
     * Get the fullArt value.
     *
     * @return the fullArt value
     */
    public Boolean fullArt() {
        return this.fullArt;
    }

    /**
     * Set the fullArt value.
     *
     * @param fullArt the fullArt value to set
     * @return the Card object itself.
     */
    public Card withFullArt(Boolean fullArt) {
        this.fullArt = fullArt;
        return this;
    }

    /**
     * Get the watermark value.
     *
     * @return the watermark value
     */
    public String watermark() {
        return this.watermark;
    }

    /**
     * Set the watermark value.
     *
     * @param watermark the watermark value to set
     * @return the Card object itself.
     */
    public Card withWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * Get the borderColor value.
     *
     * @return the borderColor value
     */
    public BorderColors borderColor() {
        return this.borderColor;
    }

    /**
     * Set the borderColor value.
     *
     * @param borderColor the borderColor value to set
     * @return the Card object itself.
     */
    public Card withBorderColor(BorderColors borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * Get the storySpotlightNumber value.
     *
     * @return the storySpotlightNumber value
     */
    public Integer storySpotlightNumber() {
        return this.storySpotlightNumber;
    }

    /**
     * Set the storySpotlightNumber value.
     *
     * @param storySpotlightNumber the storySpotlightNumber value to set
     * @return the Card object itself.
     */
    public Card withStorySpotlightNumber(Integer storySpotlightNumber) {
        this.storySpotlightNumber = storySpotlightNumber;
        return this;
    }

    /**
     * Get the storySpotlightUri value.
     *
     * @return the storySpotlightUri value
     */
    public String storySpotlightUri() {
        return this.storySpotlightUri;
    }

    /**
     * Set the storySpotlightUri value.
     *
     * @param storySpotlightUri the storySpotlightUri value to set
     * @return the Card object itself.
     */
    public Card withStorySpotlightUri(String storySpotlightUri) {
        this.storySpotlightUri = storySpotlightUri;
        return this;
    }

    /**
     * Get the timeshifted value.
     *
     * @return the timeshifted value
     */
    public Boolean timeshifted() {
        return this.timeshifted;
    }

    /**
     * Set the timeshifted value.
     *
     * @param timeshifted the timeshifted value to set
     * @return the Card object itself.
     */
    public Card withTimeshifted(Boolean timeshifted) {
        this.timeshifted = timeshifted;
        return this;
    }

    /**
     * Get the colorshifted value.
     *
     * @return the colorshifted value
     */
    public Boolean colorshifted() {
        return this.colorshifted;
    }

    /**
     * Set the colorshifted value.
     *
     * @param colorshifted the colorshifted value to set
     * @return the Card object itself.
     */
    public Card withColorshifted(Boolean colorshifted) {
        this.colorshifted = colorshifted;
        return this;
    }

    /**
     * Get the futureshifted value.
     *
     * @return the futureshifted value
     */
    public Boolean futureshifted() {
        return this.futureshifted;
    }

    /**
     * Set the futureshifted value.
     *
     * @param futureshifted the futureshifted value to set
     * @return the Card object itself.
     */
    public Card withFutureshifted(Boolean futureshifted) {
        this.futureshifted = futureshifted;
        return this;
    }

    /**
     * Get the purchaseUris value.
     *
     * @return the purchaseUris value
     */
    public Map<String, String> purchaseUris() {
        return this.purchaseUris;
    }

    /**
     * Set the purchaseUris value.
     *
     * @param purchaseUris the purchaseUris value to set
     * @return the Card object itself.
     */
    public Card withPurchaseUris(Map<String, String> purchaseUris) {
        this.purchaseUris = purchaseUris;
        return this;
    }

    /**
     * Get the relatedUris value.
     *
     * @return the relatedUris value
     */
    public Map<String, String> relatedUris() {
        return this.relatedUris;
    }

    /**
     * Set the relatedUris value.
     *
     * @param relatedUris the relatedUris value to set
     * @return the Card object itself.
     */
    public Card withRelatedUris(Map<String, String> relatedUris) {
        this.relatedUris = relatedUris;
        return this;
    }

}
