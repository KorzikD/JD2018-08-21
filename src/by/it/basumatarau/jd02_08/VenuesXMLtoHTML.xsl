<?xml version="1.0" encoding="UTF-8" ?>
<xslns:stylesheet version="1.0" xmlns:xslns="http://www.w3.org/1999/XSL/Transform">
    <xslns:output method="html"/>

    <xslns:template match="/Venues">
        <table border="1">
            <tr>
                <td>Name</td><td>TypeTags</td><td>Description</td><td>Place</td>
                <td>OpeningHours</td><td>OpeningDates</td><td>ParticipationFee</td>
            </tr>
            <xslns:apply-templates/>
        </table>
    </xslns:template>
    <xslns:template match="/Venues/Venue">
        <tr>
            <xslns:apply-templates/>
        </tr>
    </xslns:template>
    <xslns:template match="/Venues/Venue/Name">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/TypeTags">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/Description">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/Place">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/OpeningHours">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/OpeningDates">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>

    <xslns:template match="/Venues/Venue/ParticipationFee">
        <td>
            <xslns:apply-templates/>
        </td>
    </xslns:template>
</xslns:stylesheet>