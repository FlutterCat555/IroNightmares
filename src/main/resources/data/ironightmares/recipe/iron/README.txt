Hi :3
this is the reference for converting all the rest of these recipes to 1.21.5
All of the iron folder is already done.  Feel free to use it as a copy/paste refrence.

================================================ CRAFTING ==============================================================

OLD craft JSON

{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "key": {
    "#": {
      "item": "ironightmares:raw_iron_nugget"
    }
  },
  "result": {
    "id": "minecraft:raw_iron",
    "count": 1
  }
}

NEW craft JSON

{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "key": {
    "#": "ironightmares:raw_iron_nugget"
  },
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "result": {
    "count": 1,
    "id": "minecraft:raw_iron"
  }
}

============================================= REVERSE CRAFTING =========================================================

OLD reverse craft JSON

{
  "type": "minecraft:crafting_shapeless",
  "category": "misc",
  "ingredients": [
    {
      "item": "minecraft:raw_iron"
    }
  ],
  "result": {
    "id": "ironightmares:raw_iron_nugget",
    "count": 9
  }
}

NEW reverse craft JSON

{
  "type": "minecraft:crafting_shapeless",
  "category": "misc",
  "ingredients": [
      "minecraft:raw_iron"
  ],
  "result": {
    "count": 9,
    "id": "ironightmares:raw_iron_nugget"
  }
}

================================================= SMELTING =============================================================

OLD smelting JSON

{
  "type": "minecraft:smelting",
  "category": "misc",
  "group": "iron_nugget",
  "ingredient": {
    "item": "ironightmares:raw_iron_nugget"
  },
  "result": {
    "id": "minecraft:iron_nugget"
  },
  "experience": 0.5,
  "cookingtime": 200
}

NEW smelting JSON

{
  "type": "minecraft:smelting",
  "category": "misc",
  "cookingtime": 200,
  "experience": 0.5,
  "ingredient": [
    "ironightmares:raw_iron_nugget"
  ],
  "result": {
    "id": "minecraft:iron_nugget"
  }
}

