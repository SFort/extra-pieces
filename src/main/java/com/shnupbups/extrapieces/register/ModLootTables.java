package com.shnupbups.extrapieces.register;

import com.shnupbups.extrapieces.ExtraPieces;
import com.shnupbups.extrapieces.blocks.PieceBlock;
import com.shnupbups.extrapieces.core.PieceSet;
import com.shnupbups.extrapieces.core.PieceSets;
import com.swordglowsblue.artifice.api.ArtificeResourcePack;

public class ModLootTables {
	public static void init(ArtificeResourcePack.ServerResourcePackBuilder data) {
		int l = 0;
		for (PieceSet ps : PieceSets.registry.values()) {
			for (PieceBlock pb : ps.getPieceBlocks()) {
				if (!ps.isVanillaPiece(pb.getType())) {
					pb.getType().addLootTable(data, pb);
					l++;
				}
			}
		}
		ExtraPieces.log("Added " + l + " loot tables!");
	}
}
