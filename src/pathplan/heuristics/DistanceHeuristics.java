/**
 * RACT-PAL (RACT Path-Planning Algorithms Library) - A Library of Path Planning
 * Algorithms
 * 
 * Copyright (C) 2010 Abhijeet Anand, RACT - RMIT Agent Contest Team, School of
 * Computer Science and Information Technology,
 * RMIT University, Melbourne VIC 3000.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package pathplan.heuristics;


import entity.SearchDomain;
import entity.State;

/**
 * A distance based heuristics which is mostly applicable in geometric world.
 * 
 *
 */
public interface DistanceHeuristics extends Heuristics {

    public float h(SearchDomain map, State cNode, State gNode);

    public boolean updateH(SearchDomain map, State cNode, State gNode, float hModifier);
    

}
