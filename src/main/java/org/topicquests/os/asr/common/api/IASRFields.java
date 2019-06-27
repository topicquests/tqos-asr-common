/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr.common.api;

/**
 * @author jackpark
 * This collection can be extended by various agents.
 * For now, it attempts to collect all knowable fields
 * for which statistics will be collected
 */
public interface IASRFields {
	public static final String
		//WORDS
		WORDS_READ	= "WDR",	//Total number of words read
		WORDS_NEW	= "WDN",	// New words read
		//WordGrams
		WG1			= "WG1", 	//Terminal
		WG2			= "WG2",	//Pair
		WG3			= "WG3",	//Triple
		WG4			= "WG4",	//Quad
		WG5			= "WG5",	//Fiver
		WG6			= "WG6",	//Sixer
		WG7			= "WG7",	//Sevener
		WG8			= "WG8",	//Eighter
		WG9			= "WG9",	//Niner Label
		WG10		= "WG10",	//Tenner Label
		WG11		= "WG11",	//Elevener Label
		WG12		= "WG12",	//Twelver Label
		//WordGram Edges
		WGEI		= "WGEI",   //IsA Edge
		WGEC		= "WGEC",   //Cause Edge
		//Documents
		DOCS_IMPORTED	= "DOCI",
		DOCS_READ		= "DOCR",
		//SENTENCES
		SENTS_IMPORTED	= "SENTI",
		SENTS_READ		= "SENTR",
		//TUPLES
		TUPLES_FOUND	= "TUPS",
		//Topics
		TOPICS			= "TOPS",
		//Conceptual Graphs
		CONCEPTUAL_GRPHS	= "CGS";
		
}
