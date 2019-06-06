/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr.common.api;

/**
 * @author jackpark
 *
 */
public interface IASRFieldNames {
	public static final String
	//WORDS
	WORDS_READ	= "Total Words Read",	//Total number of words read
	WORDS_NEW	= "New Words Read",	// New words read
	//WordGrams
	WG1			= "Number of WordGrams Size 1", 	//Terminal
	WG2			= "Number of WordGrams Size 2",	//Pair
	WG3			= "Number of WordGrams Size 3",	//Triple
	WG4			= "Number of WordGrams Size 4",	//Quad
	WG5			= "Number of WordGrams Size 5",	//Fiver
	WG6			= "Number of WordGrams Size 6",	//Sixer
	WG7			= "Number of WordGrams Size 7",	//Sevener
	WG8			= "Number of WordGrams Size 7",	//Eighter
	//Documents
	DOCS_IMPORTED	= "Number of Documents Imported",
	DOCS_READ		= "Number of Documents Read",
	//SENTENCES
	SENTS_IMPORTED	= "Number of Sentences Imported",
	SENTS_READ		= "Number of Sentences Read",
	//TUPLES
	TUPLES_FOUND	= "Number of Tuples Discovered",
	//Topics
	TOPICS			= "Number of Topics",
	//Conceptual Graphs
	CONCEPTUAL_GRPHS	= "Number of Conceptual Graphs";
}
